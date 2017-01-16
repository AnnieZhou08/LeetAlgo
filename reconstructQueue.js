/**
 * @param {number[][]} people
 * @return {number[][]}
 */
var reconstructQueue = function(people) {
    var sorted = mysort(people);
    var result = [];
    while(sorted.length !== 0){
        var to_insert = sorted[sorted.length-1];
        var count = to_insert[1]; //count how many people in front of it;
        result.splice(count,0,to_insert);
        sorted.pop();
    }
    
    return result;
};

function mysort(people){
    var sorted = [];
    var didInsert = false;
    for (var i = 0; i < people.length; i++){
        var to_insert = people[i];
        for (var j = 0; j < sorted.length; j++){
            var inserted = sorted[j];
            
            if(to_insert[0]<inserted[0]){
                sorted.splice(j,0,to_insert);
                didInsert = true;
                break;
            }else if (to_insert[0] == inserted[0]){
                if(to_insert[1] < inserted[1]){
                    didInsert = false;
                    continue;
                }else if (to_insert[1] > inserted[1]){
                    sorted.splice(j,0,to_insert);
                    didInsert = true;
                    break;
                }
            }else if (to_insert[0] > inserted[0]){
                didInsert = false;
                continue;
            }
        }
        if(didInsert === false){
            sorted.push(to_insert);
            didInsert = true;
        }
    }
    console.log(sorted);
    return sorted;
}