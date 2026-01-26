/**
 * E09 – Async/Promises
 */

export async function delay(ms: number): Promise<void> {
  // resuelve tras ms; Error si ms<0 o no finito
  if (!Number.isFinite(ms) || ms < 0) {
    throw new Error("Invalid delay time");
  }
  return new Promise<void>(resolve => setTimeout(resolve, ms));
}

export async function retry<T>(fn: () => Promise<T>, attempts: number): Promise<T> {
  // reintenta attempts veces; si resuelve devuelve; si falla siempre lanza último error
  let lastError: unknown;
  for (let i = 0; i < attempts; i++) {
    try {
      return await fn();
    } catch (err) {
      lastError = err;
    }
  }
  throw lastError;
}

export async function parallelSum(values: Array<Promise<number>>): Promise<number> {
  // Promise.all y suma; Error si alguno no es finito
  const results = await Promise.all(values);
  for (const n of results) {
    if (!Number.isFinite(n)) {
      throw new Error("Non-finite number in results");
    }
  }
  return results.reduce((sum, n) => sum + n, 0);
}
