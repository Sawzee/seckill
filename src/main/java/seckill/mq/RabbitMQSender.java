package mq;

/**
 * 可靠确认模式
 */
//@Component
//public class RabbitMQSender implements  RabbitTemplate.ConfirmCallback{
public class RabbitMQSender {

//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    public void send(String message) {
//        rabbitTemplate.setConfirmCallback(this);
//        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
//        rabbitTemplate.convertAndSend("seckillExchange", "seckillRoutingKey", message, correlationData);
//    }
//
//    @Override
//    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
//        log.info("callbakck confirm: " + correlationData.getId());
//        if (ack){
//            log.info("插入record成功，更改库存成功");
//        }else{
//            log.info("cause:"+cause);
//        }
//    }
}
