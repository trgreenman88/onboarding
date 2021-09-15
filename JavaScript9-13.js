const longestSubstring = (string) => {
    let substringArray = [];
    let stringArray = [];
    for(var i=0; i < string.length; i++){
        if(!stringArray.includes(string.charAt(i))){
            stringArray.push(string.charAt(i));
        }else{
            substringArray.push(stringArray);
            stringArray = [];
            stringArray.push(string.charAt(i));
        }
        if(i===string.length-1 && stringArray.length > 0){
            substringArray.push(stringArray);
        }
    }

    let longest = 0;
    let index = -1;
    for(var i=0; i < substringArray.length; i++){
        if(substringArray[i].length > longest){
            longest = substringArray[i].length;
            index = i;
        }
    }

    let substring = "";
    for(var i=0; i < longest; i++){
        substring = substring.concat(substringArray[index][i]);
    }

    return (substring);
}

console.log(longestSubstring("abcabcbb"));
console.log(longestSubstring("aaaaaa"));
console.log(longestSubstring("abcde"));
console.log(longestSubstring("abcda"));
