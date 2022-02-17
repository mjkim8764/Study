/*

배열 메서드의 반환 패턴

1. 원본의 직접적인 수정(mutator method).
2. 원본은 변경하지 않고, 새로운 값을 생성하여 반환(accessor method).

*/

// 원본을 변경하지 않고, 새로운 값을 반환하는 Accessor methods.

// 1. concat(), concatenation(접합, 연결) : 두 개 이상의 배열을 합쳐서 새로운 배열을 반환.
console.group('concat()');  //group ~ groupEnd : 개발 도구 콘솔창에서 토글링 가능하도록 함.
const disney = ['mickey', 'mini', 'stitch', 'donald duck'];
const ghibli = ['howl', 'totoro', 'momonoke', 'kiki'];

const animations = disney.concat(ghibli);  // disney, ghibli : 원본 배열
console.log(animations);

// 원본 배열은 변함이 없음.
console.log(disney);
console.log(ghibli);
console.groupEnd();


// 2. join() : 모든 배열 요소들을 string으로 변환
console.group('join()');
const fish = ['shark', 'whale', 'koi', 'nemo(?)', 'defense'];
const fishString = fish.join();  // join() 내부에 별도의 파라미터를 지정하지 않으면 ,(comma)를 기준으로 합쳐짐.
console.log(typeof fishString, fishString);
console.log(fish);
console.groupEnd();

// 3. slice() : 일부 요소들을 잘라서(가져다가) 새로운 요소로 반환.
console.group('slice()');
console.log(fish);
let slicedFishArr = fish.slice(2);  // 2번 인덱스부터 끝까지.
console.log(slicedFishArr);

slicedFishArr = fish.slice(2, 4); // 2번 인덱스 ~ 3(4 - 1)번 인덱스까지
console.log(slicedFishArr);
console.groupEnd();

// 4. indexOf() : 배열에서 찾고자 하는 요소의 가장 첫 번째 인덱스 위치만 반환. (찾고자 하는 요소가 중복이어도)
console.group('indexOf()');
fish = ['shark', 'whale', 'koi', 'whale', 'nemo'];

console.log(fish);
console.log(`fish array에서 'whale'의 가장 첫 번째 인덱스의 위치 : ${fish.indexOf('whale')}` );

// 찾고자 하는 요소가 없을 경우
console.log(`한치가 있나요? 한치는 오징어인데.. ${fish.indexOf('hanchi')}`);
console.groupEnd();

// 5. lastIndexOf() : 배열에서 찾고자 하는 요소의 가장 마지막 인덱스 위치를 반환.
console.group(`lastIndexOf()`);
console.log(fish);
console.log(`whale이 위치한 마지막 인덱스 위치 : ${fish.lastIndexOf('whale')}`);
console.groupEnd();




