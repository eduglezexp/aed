/**
 * E02 – Date: parseo YYYY-MM-DD, validación y diferencias en días.
 */

export function isValidISODate(iso: string): boolean {
  // regex yyyy-mm-dd + Date válida + conserva componentes (evita 2026-02-30)
  const match: RegExpExecArray | null = /^(\d{4})-(\d{2})-(\d{2})$/.exec(iso);
  if (!match) return false;
  const year: number = Number(match[1]);
  const month: number = Number(match[2]);
  const day: number = Number(match[3]);
  const date: Date = new Date(Date.UTC(year, month - 1, day));
  return (
    date.getUTCFullYear() === year &&
    date.getUTCMonth() === month - 1 &&
    date.getUTCDate() === day
  );
}

export function nightsBetween(entrada: string, salida: string): number {
  // intervalo [entrada, salida) => noches. Error si salida<=entrada o fechas inválidas
  if (!isValidISODate(entrada) || !isValidISODate(salida)) {
    throw new Error("Invalid date");
  }
  const [year1, month1, day1]: number[] = entrada.split("-").map(Number);
  const [year2, month2, day2]: number[] = salida.split("-").map(Number);
  const start: number = Date.UTC(year1, month1 - 1, day1);
  const end: number = Date.UTC(year2, month2 - 1, day2);
  if (end <= start) {
    throw new Error("Salida must be after entrada");
  }
  const MS_PER_DAY: number = 24 * 60 * 60 * 1000;
  return (end - start) / MS_PER_DAY;
}

export function toIsoDateOnly(date: Date): string {
  // "YYYY-MM-DD" desde Date (UTC). Error si date inválida.
  if (!(date instanceof Date) || Number.isNaN(date.getTime())) {
    throw new Error("Invalid Date");
  }
  const year: number = date.getUTCFullYear();
  const month: string = String(date.getUTCMonth() + 1).padStart(2, "0");
  const day: string = String(date.getUTCDate()).padStart(2, "0");
  return `${year}-${month}-${day}`;
}
