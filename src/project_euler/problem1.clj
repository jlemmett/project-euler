(ns problem1
  "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.")



(defn multiples-of-3-and-5 [max]
  "Returns natural numbers from 1 to max - 1 that are multiples of 3 or 5"
  (let [numbers (range 1 max)]
    (filter #(or (= 0 (mod % 5)) (= 0 (mod % 3))) numbers)))

(multiples-of-3-and-5 10)
;; = (3 5 6 9)

(apply + (multiples-of-3-and-5 1000))
;; = 233168












