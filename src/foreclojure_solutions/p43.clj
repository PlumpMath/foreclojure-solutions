(ns foreclojure-solutions.p43
  (:use midje.sweet))

(defn ri [coll n]
  "What if I add a doc string here?"
   (apply map list (partition n coll)))

(facts "Reverse Interleave"
  (ri [1 2 3 4 5 6] 2) '((1 3 5) => (2 4 6))
  (ri (range 9) 3) '((0 3 6) (1 4 7) => (2 5 8))
  (ri (range 10) 5) '((0 5) (1 6) (2 7) (3 8) => (4 9)))
