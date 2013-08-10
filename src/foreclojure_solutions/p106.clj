(ns foreclojure-solutions.p106
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Number Maze"
  1 => (__ 1 1)
  3 => (__ 3 12)
  3 => (__ 12 3)
  3 => (__ 5 9)
  9 => (__ 9 2)
  (= 5 (__ 9 12))
   => true)
