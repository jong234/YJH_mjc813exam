<template>
  <div>
    <HelloWorld/>
    <div v-for="item in list" :key="item">
      {{ item.tltle }}
    </div>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import axios from 'axios';

export default {
  name: 'App',
  components: {
    HelloWorld
  },
 async mounted(){
  const 결과 = await axios.get('https://jsonplaceholder.typicode.com/posts');
  this.list = 결과.data;
  },
  data(){
    return{
      list: []
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
