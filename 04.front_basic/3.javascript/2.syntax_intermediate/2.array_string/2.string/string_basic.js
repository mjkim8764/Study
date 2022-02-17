/*
String을 사용하는 방식 : '', "", ``(backtick)
*/


// 템플릿 리터럴 방식(Template literal)
const novel = 'The Little Prince';
const author = 'Saint-Exupery';

console.log(`My favorite nobel is ${novel}`);

const address = 
    'Homer J. Simpson\n' +
    '742 Evergreen Terrace\n' +
    'Springfield';

console.log(address);

// backtick은 엔터 치면 자동 개행해줌.
const address2 = `Homer J. Simpson
742 Evergreen Terrace
Springfiled`;
console.log(address2);
