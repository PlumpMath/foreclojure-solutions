(ns foreclojure-solutions.p110
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sequence of pronunciations"
  [[1 1] [2 1] [1 2 1 1]] => (take 3 (__ [1]))
  [3 1 2 4] => (first (__ [1 1 1 4 4]))
  [1 1 1 3 2 1 3 2 1 1] => (nth (__ [1]) 6)
  (= 338 (count (nth (__ [3 2]) 15)))
   => true)
