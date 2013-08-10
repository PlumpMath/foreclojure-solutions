(ns foreclojure-solutions.p97
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Pascal's Triangle"
  (__ 1) => [1]
  (map __ (range 1 6)) => [     [1]
          [1 1]
         [1 2 1]
        [1 3 3 1]
       [1 4 6 4 1]]
  (__ 11) => [1 10 45 120 210 252 210 120 45 10 1])
