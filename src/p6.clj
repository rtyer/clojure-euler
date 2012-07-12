(ns p6)

(def nums (range 1 101))

(defn square
  [n]
  (* n n))

(defn sum-of-squares
  [r]
  (reduce + (map square r)))

(defn square-of-sum
  [r]
  (square (reduce + r)))
(-
  (square-of-sum nums)
  (sum-of-squares nums))