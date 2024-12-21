///
/// 
///
/// Time Complexity: O(n)
///   where n is longest of the two strings


class Solution {
    func mergeAlternately(_ word1: String, _ word2: String) -> String {
        let count: Int = max(word1.count, word2.count)
        let one: [Character] = Array(word1)
        let two: [Character] = Array(word2)
        var merged: String = ""
        for i in 0..<count {
            if i < word1.count {
                merged.append(one[i])
            }
            if i < word2.count {
                merged.append(two[i])
            }
        }
        return merged
    }
}
