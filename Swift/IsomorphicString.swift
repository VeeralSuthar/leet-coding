class IsomorphicString {
    func isIsomorphic(_ s: String, _ t: String) -> Bool {
        var map = [Character : Character]()
        let sArr = Array(s)
        let tArr = Array(t)
        // s.count == t.count
        for i in 0..<s.count {
            let sChar = sArr[i]
            let tChar = tArr[i]
            if (map[sChar] == nil) {
                // check if t[i] is associated with another key
                if map.values.contains(tChar) { return false }
                map[sChar] = tChar 
            } else {
                if (map[sChar] != tChar) { return false }
            }
        }
        return true
    }
}