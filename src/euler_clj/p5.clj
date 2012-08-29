(ns euler-clj.p5)
;;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

;;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

;;figured that any number that works will be a multiple of 2520

(def possibles 
  (range 2520 (reduce * (range 1 21)) 2520))
  
(defn factor-of-all?
  [n]
  (every? zero? (map rem (repeat n) (range 1 21))))

(time
	(first 
	  (filter factor-of-all? possibles)))