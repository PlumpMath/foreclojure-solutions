(ns foreclojure-solutions.p8
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Sets"
  __ => (set '(:a :a :b :c :c :c :c :d :d))
  __ => (clojure.set/union #{:a :b :c} #{:b :c :d}))
