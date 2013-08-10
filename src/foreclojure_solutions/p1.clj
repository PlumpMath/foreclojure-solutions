(ns foreclojure-solutions.p1
  (:use midje.sweet))

(defn me []
  true)

(fact "Nothing but the Truth"
  (me) => true)
