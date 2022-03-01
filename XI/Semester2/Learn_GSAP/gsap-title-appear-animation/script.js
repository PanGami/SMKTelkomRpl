jQuery(document).ready(function($){
  //for running once remove the reapet and repeat dealay on line 6,7
  
  let contact_anim = new TimelineMax({
                paused:true,
                repeat:5,
                repeatDelay:0.8
                                     });
               contact_anim.to('.line',0.5,{scale:1,ease:Power4.easeOut});
               contact_anim.to('.line',1,{left:"100%",ease:Power2.easeOut});
               contact_anim.add('streched',0.5);
               $('.contact').children().each(function(index){
                  let span =  $(this)[0];
                  let label = "appear"+index;
                  contact_anim.add(label, 0.5 + index * 0.1 )
                  contact_anim.to(span,0.2,{opacity:1,ease:Power3.easeOut},label);
               })
               contact_anim.to('.line',0.5,{scale:0,ease:Power4.easeOut});
               contact_anim.play();
  
  
              contact_anim.play();
  
    



  
})