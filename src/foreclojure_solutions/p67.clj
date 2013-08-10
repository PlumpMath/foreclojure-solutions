(ns foreclojure-solutions.p67
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Prime Numbers"
  (__ 2) => [2 3]
  (__ 5) => [2 3 5 7 11]
  (last (__ 100)) => 541)
