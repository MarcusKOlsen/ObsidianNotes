---
updated_at: 2025-02-12T11:00:12.564+01:00
edited_seconds: 840
---
## 2.4.1 
### a) What PC models have a speed of at least 3.00?
``` sql
SELECT model FROM PC
WHERE speed <= 3.00
```

### c) Find the model number and price of all products (of any type) made by manufacturer B
A = PROJECTION(model, price)(pc);
B = PROJECTION(model, price)(laptop);
C = PROJECTION(model, price)(printer);

D = UNION(UNION(A, B), C);
E= NATURALJOIN(D, Product)
PROJECTION(model, price)SELECTION(maker == b)(E)

### d) Find the model numbers of all color laser printers
PROJECTION(MODEL)SELECTION(color == true AND type == laser)(Printer)

### e) Find those manufacturers that sell Laptops, but not PC's
A = PROJECTION(maker) ( PROJECTION(maker, type)(SELECTION(type=laptop)(Product) - SELECTION(type=pc)); 