(ns foreclojure-solutions.p68
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Recurring Theme"
  __ => (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result)))
