// 산술 연산자
// console.log(5 + 5);
// console.log(5 - 10);
// console.log(2.6432 / 2);
// console.log(5 * 5);

// 증감 연산자
let age = 5;

// 전위, 후위 연산자
console.log(++age);
console.log(age++);
console.log(age);

// 관계 연산자(결과값이 true or false가 나오도록 하는 문(statement)을 조건식(condition)이라고 함.)
console.log(5 > 6);
console.log(6 >= 6);

// 동등 연산자
console.log(1 == '1');  // true, 타입이 서로 다를 경우, (암시적(묵시적), implicit)으로 변환하여 비교함.
console.log(1 === '1');  // false, 엄격한 비교(strict mode)

// 논리 연산자
console.log(true && true); // and연산(~이고), true
console.log(5 > 3 && 2 === 2); // true
console.log(5 > 3 || 2 !== 2); // or 연산(~이거나), true

// 삼항 연산자
const yourAge = 15;
const beverage = (yourAge >= 20) ? 'Soju' : 'sprite';
console.log(beverage);

// 할당 연산자(우선 순위가 거의 아래에 있음.) 변수에 값을 할당(assignment)할 때 사용하는 연산자.
let myAge = 40;
console.log(myAge);
myAge += 10;
console.log(myAge);


