(ns foreclojure-solutions.p158
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Decurry"
  10 => ((__ (fn [a]
               (fn [b]
                 (fn [c]
                   (fn [d]
                     (+ a b c d))))))
         1 2 3 4)
  24 => ((__ (fn [a]
               (fn [b]
                 (fn [c]
                   (fn [d]
                     (* a b c d))))))
         1 2 3 4)
  (= 25 ((__ (fn [a]
               (fn [b]
                 (* a b))))
         5 5))
   => true)
