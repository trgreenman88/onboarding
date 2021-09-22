const getHashTags = (headline)=>{
    headline = headline.replace(',', '');
    headline = headline.replace('.', '');
    headline = headline.toLowerCase();
    const words = headline.split(' ');
    let longestWords = [];
    for(let i=0; i<words.length; i++){
        if(longestWords.length < 3){
            longestWords.push("#"+words[i]);
        }else{
            let shortestWordIndex = -1;
            if(longestWords[0].length <= longestWords[1].length && longestWords[0].length <= longestWords[2].length){
                shortestWordIndex = 0;
            }else if(longestWords[1].length <= longestWords[0].length && longestWords[1].length <= longestWords[2].length){
                shortestWordIndex = 1;
            }else{
                shortestWordIndex = 2;
            }
            if(words[i].length+1 > longestWords[shortestWordIndex].length){
                longestWords.splice(shortestWordIndex, 1);
                longestWords.push("#"+words[i]);
            }
        }
    }

    return longestWords;
}

console.log(getHashTags("How the Avocado Became the Fruit of the Global Trade"));
console.log(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year"));
console.log(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit"));
console.log(getHashTags("Visualizing Science"));