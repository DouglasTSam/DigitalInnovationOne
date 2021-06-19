/*    ************** AULA 1 ************** 

var nome = "Douglas Tinoco";
var idade = 24;
var idade2 = 14;
var frase = "Japão é o melhor time do mundo";

//alert(nome + " tem "+idade+" anos");
//alert(idade+idade2);
console.log(nome);
console.log(idade+idade2);
console.log(frase)
console.log(frase.replace("Japão", "Brasil").toUpperCase());*/


/*    ************** AULA 2 ************** 
var lista = ["maça", "pêra", "laranja"];
lista.push("uva");
console.log(lista);
lista.pop(); // remove o último elemento da lista
console.log(lista);
console.log("tamanho da lista " + lista.length)
console.log(lista.toString());
console.log(lista.join(" - "));

var frutas = {nome: "maça", cor: "vermelha"}
console.log(frutas);
console.log(frutas.nome); // alert(frutas.nome);
console.log(frutas.cor); // alert(frutas.cor);

var fruits = [{nome: "maça", cor: "vermelha"},{nome: "uva", cor: "roxa"}]
console.log(fruits);
console.log(fruits[1].nome); // alert(fruits[1].nome);
console.log(fruits[1].cor); // alert(fruits[1].cor);
*/


/*    ************** AULA 3 ************** 


//var idade = prompt("Qual a sua idade ? ");
if(idade>= 18){
    alert("Maior de idade");
}else{
    alert("Menor de idade");
}




var count = 0;
while(count <= 5){
    //console.log(count);
    count++;
}



var count;
for(count =0; count <= 5; count++){
    console.log(count);
}



var d = new Date();
alert("Data completa : "+d);
alert(d.getMonth()+1);
alert("Horas : "+d.getHours());
alert("Minutos : "+d.getMinutes());
alert("Segundos :"+d.getSeconds());
*/



/*    ************** AULA 4 ************** 

function soma(n1,n2){
    return n1+n2;
}
//alert(soma(5,10));


var validar=0; // global
function validaIdade(idade){
    validar; // se por var validar usa local
    if(idade>= 18){
        validar = true;
    }else{
        validar = false;
    }
    return validar;
}
var idade = prompt("Qual a sua idade ?");
console.log(validaIdade(idade));
*/


/*    ************** AULA 5 ************** */

var contagem = 0;
function clicou(){
    var contador = document.getElementById("numeroContador");
    contagem++;
    contador.textContent = contagem;
    
    
    console.log(agradecimento);
    console.log(contador);
}

function redirecionar(){
    window.open("https://google.com"); // abre uma nova aba
    window.location.href="https://youtube.com"; // abre na mesma aba
}

function trocar(){
    document.getElementById("mouse1").innerHTML = "Obrigado por passar o mouse"
}

function voltar(){
    document.getElementById("mouse1").innerHTML = "Passe o mouse aqui"
}

function trocar2(elemento){
    elemento.innerHTML = "Obrigado por passar o mouse"
}

function voltar2(elemento){
    elemento.innerHTML = "Passe o mouse aqui"
}

function load(){
    alert("página carregada");
}

function funcaoChange(elemento){
    console.log(elemento.value)
}
