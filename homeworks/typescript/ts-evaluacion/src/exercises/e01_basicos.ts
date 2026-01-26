/**
 * E01 – Tipos básicos: string/number/boolean/null/undefined
 */

export function normalizeBearer(authHeader: string): string {
  // trim + "Bearer <token>" (case-insensitive), colapsa espacios a 1, Error si inválido
  const normalized = authHeader.trim().replace(/\s+/g, ' ');
  if (!normalized.toLowerCase().startsWith('bearer ')) {
    throw new Error("Invalid Authorization header");
  }
  return normalized.replace(/^bearer /i, 'Bearer ');
}

export function clamp01(value: number): number {
  // Devuelve value limitado a [0,1]. Error si NaN o no finito.
  if (!isFinite(value)) {
    throw new Error("Value must be a finite number");
  }
  if (value < 0) return 0;
  if (value > 1) return 1;
  return value;
}

export function safeBool(value: boolean | null | undefined): boolean {
  // null/undefined => false; boolean => mismo valor
  return value ?? false;
}
