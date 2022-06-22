let a = 10;
const b = 2;
let myName = "changyu";
// constant(상수): 바뀔 수 없다
// let: 바뀔 수 있다. 새로운 것을 생성할 때 쓰는 것 (업데이트를 원할 때)
// always const, sometimes let

console.log(a + b);
console.log(a * b);
console.log(a / b);
console.log("hello, I'm "+myName);

myName = "Han";
console.log("new name is "+myName);

const amIFat = true;
console.log(amIFat);

const nullIs = null; // js는 null값도 저장 가능
console.log(nullIs);

let something; // 이 상태는 undifined, 값을 아직 안 줬을 때
console.log(something);

