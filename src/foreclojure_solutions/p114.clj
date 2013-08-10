(ns foreclojure-solutions.p114
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Global take-while"
  [2 3 5 7 11 13] => (__ 4 #(= 2 (mod % 3))
           [2 3 5 7 11 13 17 19 23])
  ["this" "is" "a" "sentence"] => (__ 3 #(some #{\i} %)
           ["this" "is" "a" "sentence" "i" "wrote"])
  ["this" "is"] => (__ 1 #{"a"}
           ["this" "is" "a" "sentence" "i" "wrote"]))
