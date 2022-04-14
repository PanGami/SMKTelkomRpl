let app = new Vue({
    el: '#app',
    data: {
        todos: [],
        todo: ""
    },
    created(){
        this.loadLocalStorage();
    },
    watch:{
        todos(){
            localStorage.setItem("todos", JSON.stringify(this.todos));
        }
    },
    methods: {
        loadLocalStorage: function(){
            if(localStorage.getItem("todos") != null){
                this.todos = JSON.parse(localStorage.getItem("todos"));
            }
        },
        addTodo: function () {
            this.todos.push(this.todo);
            this.todo = ""
        },
        deleteTodo: function (index) {
            this.todos.splice(index, 1);
        },
    }
})