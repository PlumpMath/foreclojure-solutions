(ns foreclojure-solutions.p54
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Partition a Sequence"
  (__ 3 (range 9)) '((0 1 2) (3 4 5) => (6 7 8))
  (__ 2 (range 8)) '((0 1) (2 3) (4 5) => (6 7))
  (__ 3 (range 8)) '((0 1 2) => (3 4 5)))
