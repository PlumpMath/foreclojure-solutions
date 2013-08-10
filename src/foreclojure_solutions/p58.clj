(ns foreclojure-solutions.p58
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Function Composition"
  [3 2 1] => ((__ rest reverse) [1 2 3 4])
  5 => ((__ (partial + 3) second) [1 2 3 4])
  true => ((__ zero? #(mod % 8) +) 3 5 7 9)
  "HELLO" => ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
