(ns foreclojure-solutions.p19
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Last Element"
  (__ [1 2 3 4 5]) => 5
  (__ '(5 4 3)) => 3
  (__ ["b" "c" "d"]) => "d")
