// ejemplos/02-tipos-compuestos.ts
let usuario: {
  nombre: string;
  edad: number;
  activo: boolean;
} = {
  nombre: "Carlos",
  edad: 28,
  activo: true,
};

console.log(`${usuario.nombre}, ${usuario.edad}`);

type UsuarioBasico = {
  id: number;
  nombre: string;
  email: string;
};

let u1: UsuarioBasico = {
  id: 1,
  nombre: "Ana",
  email: "ana@example.com",
};

console.log(`${u1.nombre}, ${u1.email}`);