//Imprimir los numeros del 1 al 5

for (let index = 1; index < 6; index++) {
    console.log(`Numero ${index}`);    
}

const FRUTAS = ["Mango", "Pera", "Manzana", "Naranja", "Sandia"];

for (let i = 0; i < FRUTAS.length; i++) {
    console.log(`Fruta: ${FRUTAS [i]}`);    
}

let contador = 1

while (contador <= 3){
    console.log(`Repeticion numero ${contador}`);
    contador++;
}

let numero = 1;

do {
    console.log(`Numero del Do While: ${numero}`);
    numero++;
} while (contador < 3)
