(ns foreclojure-solutions.p76
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Trampoline"
  __ => (letfn
     [(foo [x y] #(bar (conj x y) y))
      (bar [x y] (if (> (last x) 10)
                   x
                   #(foo x (+ 2 y))))]
     (trampoline foo [] 1)))
