(ns foreclojure-solutions.p107
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Simple closures"
  (= 256 ((__ 2) 16),
         ((__ 8) 2)) => true
  [1 8 27 64] => (map (__ 3) [1 2 3 4])
  [1 2 4 8 16] => (map #((__ %) 2) [0 1 2 3 4]))
