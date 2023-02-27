from collections import Counter

def solution(k, tangerine):
    answer = 0
    dict = Counter(tangerine).most_common()
    
    for box in dict:
        k -= box[1] 
        answer += 1
        
        if k <= 0:
            break
        
    return answer