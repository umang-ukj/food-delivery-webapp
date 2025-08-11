Order-Service sends order ID → "order-topic".

Payment-Service consumes "order-topic" → processes payment → sends "payment-topic".

Order-Service can consume "payment-topic" to update order status.
