.class Lcom/digdroid/alman/dig/t1$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t1$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t1$a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/digdroid/alman/dig/a4;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/h3;->f()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->e:Lcom/digdroid/alman/dig/t1$l;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/t1$l;->a()V

    return-void
.end method
