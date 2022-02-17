// callback 함수 - 기본
function greeting(name, callback2, callback3) {
    console.log(`Hello + ${name}`);
    callback2(callback3)
}

function apple(callback3) {
    console.log('쿠팡에서 사과가 도착했다.');
    callback3();
}

function send() {
    console.log('옆집 아주머니에게 전달 완료!');
}

// 함수의 선언부에 작성하는 값들은 인자값이라고 함.
function processUserInput(name, callback1, callback2, callback3) {  // 인자값(arguments)
    callback1(name, callback2, callback3); // greeting('Yoo'); 가 됨.
}

// 함수의 호출부에 작성하는 값들을 파라미터(parameter)라고 함.
processUserInput('Yoo', greeting, apple, send);



const button = document.querySelector('button');

// button.addEventListener('click', function() {
//     console.log('button clicked');
// });

button.addEventListener('click', () => {
    console.log('button clicked! ');
});