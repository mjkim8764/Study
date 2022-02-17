/*
Indexing, Spliting, Manipulating String
*/


// string을 생성하는 법
const stringPrimitive = 'A new string';
const stringObject = new String('A new String');

console.log(`${typeof stringPrimitive}, ${typeof stringObject}`);

const aString = 'How are you?';
console.log(aString);
console.log('01234567891011');
console.log(aString[4]);
console.log(aString.charAt(5));  // 지정한 인덱스에 해당하는 요소를 조회
// get the char at 5

console.log(aString.indexOf('o')); // 처음 o 위치
console.log(aString.lastIndexOf('o')); // 마지막 o 위치

console.log(aString.slice(8, 11)); // 8 ~ 10 출력
console.log(aString.length);

// Splitting strings
const originalString = 'How are you?';

// Split string by whitespace character(공백 문자를 기준으로 자르기)
const splitString = originalString.split(" ");

console.log(splitString, Array.isArray(splitString)); // 배열 타입 확인하는 메서드
console.log(typeof splitString);  // 이렇게 사용하면 객체인지 배열인지 구분이 어려움.
// Array.isArray(), static method!

// const arr = [1, 2, 3]; // arr = Array.prototype, Instance method!
// mdn에서 확인해보기 : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array
console.log(splitString[2]);

// Finding and Replacing String values

// Replace the first instance of "How" with "Where"
const newString = originalString.replace('How', 'Where');
console.log(newString);
// console.log(originalString.replace('How', 'Where'));