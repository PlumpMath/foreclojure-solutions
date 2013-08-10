(ns foreclojure-solutions.p61
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Map Construction"
  (__ [:a :b :c] [1 2 3]) => {:a 1, :b 2, :c 3}
  (__ [1 2 3 4] ["one" "two" "three"]) => {1 "one", 2 "two", 3 "three"}
  (__ [:foo :bar] ["foo" "bar" "baz"]) => {:foo "foo", :bar "bar"})
