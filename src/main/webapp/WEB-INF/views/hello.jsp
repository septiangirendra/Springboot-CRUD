<%@ include file="/WEB-INF/views/todo/header.jspf"%>
<%@ include file="/WEB-INF/views/todo/navigation.jspf"%>
<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Home Page</div>
        <div class="panel-body">
           Welcome ${name}!! <a href="/todo/list-all">Click here</a> to manage your
           todo's.
        </div>
     </div>
 </div>
<%@ include file="/WEB-INF/views/todo/footer.jspf"%>