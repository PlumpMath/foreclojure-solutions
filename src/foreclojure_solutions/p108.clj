(ns foreclojure-solutions.p108
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Lazy Searching"
  3 => (__ [3 4 5])
  4 => (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])
  7 => (__ (range) (range 0 100 7/6) [2 3 5 7 11 13])
  64 => (__ (map #(* % % %) (range))
            (filter #(zero? (bit-and % (dec %))) (range))
            (iterate inc 20)))
