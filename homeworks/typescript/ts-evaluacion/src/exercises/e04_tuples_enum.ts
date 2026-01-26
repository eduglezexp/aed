import { Role } from "../models";

/**
 * E04 – Tuples y enum
 */

export type JwtParts = [header: string, payload: string, signature: string];

export function splitJwt(token: string): JwtParts {
  // "a.b.c" => [a,b,c] exactamente 3 partes, si no => Error
  const parts: string[] = token.split(".");
  if (parts.length !== 3) {
    throw new Error("Invalid JWT format: must have 3 parts");
  }
  return [parts[0], parts[1], parts[2]];
}

export function roleFromString(value: string): Role {
  // "ADMIN"|"USER" (case-insensitive) => Role; si no => Error
  const role = value.trim().toUpperCase();
  if (role === Role.ADMIN) return Role.ADMIN;
  if (role === Role.USER) return Role.USER;
  throw new Error(`Invalid role: ${value}`);
}

export function formatUserTag(username: string, role: Role): string {
  // "juan", ADMIN => "juan#ADMIN" (username trim, no vacío)
  const name = username.trim();
  if (!name) {
    throw new Error("Username cannot be empty");
  }
  return `${name}#${role}`;
}
