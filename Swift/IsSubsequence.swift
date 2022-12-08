class isSubsequence {
    func isSubsequence(_ s: String, _ t: String) -> Bool {
        var slow: Int = 0
        var fast: Int = 0
        var count: Int = s.count

        let sArr: [Character] = Array(s)
        let tArr: [Character] = Array(t)

        //base case: s can't be bigger than t
        if (s.count > t.count) { return false }

        // if s or t are 0
        if (s.count == 0) { return true }

        for i in 0..<t.count {
            let sChar: Character = sArr[slow]
            let tChar: Character = tArr[fast]

            if (sChar == tChar) {
                slow += 1
                fast += 1
                count -= 1
            } else {
                fast += 1
            }
            if (count == 0) { return true }
        }
        return false
    }
}