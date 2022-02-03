.class Lcom/digdroid/alman/dig/t1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1;->t(Landroid/app/Activity;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Lcom/digdroid/alman/dig/t1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$e;->d:Lcom/digdroid/alman/dig/t1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t1$e;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$e;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/t1$e;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$e;->d:Lcom/digdroid/alman/dig/t1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$e;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$e;->b:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/digdroid/alman/dig/t1$e;->c:Z

    const/4 v4, 0x0

    aget-object p1, p1, v4

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/t1;->u(Landroid/app/Activity;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method
