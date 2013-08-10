(ns foreclojure-solutions.p130
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Tree reparenting"
  '(n) => (__ 'n '(n))
  '(a (t (e)))
     (__ 'a '(t (e) => (a)))
  '(e (t (a))) => (__ 'e '(a (t (e))))
  '(a (b (c))) => (__ 'a '(c (b (a))))
  '(d 
        (b
          (c)
          (e)
          (a 
            (f 
              (g) 
              (h)))))
    (__ 'd '(a
              (b 
                (c) 
                (d) 
                (e))
              (f 
                (g) => (h))))
  (= '(c 
        (d) 
        (e) 
        (b
          (f 
            (g) 
            (h))
          (a
            (i
            (j
              (k)
              (l))
            (m
              (n)
              (o))))))
     (__ 'c '(a
               (b
                 (c
                   (d)
                   (e))
                 (f
                   (g)
                   (h)))
               (i
                 (j
                   (k)
                   (l))
                 (m
                   (n)
                   (o))))))
   => true)
