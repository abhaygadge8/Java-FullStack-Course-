//find vowel count from user input
let input=prompt("please enter the msg");
let countResult=countVowel(input);
function countVowel(input){
    let result=i=>i.toLowerCase();//arrow Function
    const printStarsResult=()=>console.log("***************");
    printStarsResult();
    lowercaseInput=result(input);
    let count=0;
    for(let element of lowercaseInput){
        if(element.includes("a")||element.includes("e")||element.includes("i")||element.includes("o")||element.includes("u")){
        count++;
        }
    }
    console.log("count of vowel "+ count);
    printStarsResult();
    return count;
}

alert("count of vowel = "+ countResult);