.class Lcom/digdroid/alman/dig/d0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/f$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->k(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/d0$q;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;Lcom/digdroid/alman/dig/d0$q;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$a;->c:Lcom/digdroid/alman/dig/d0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$a;->a:Lcom/digdroid/alman/dig/d0$q;

    iput-object p3, p0, Lcom/digdroid/alman/dig/d0$a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$a;->c:Lcom/digdroid/alman/dig/d0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0$a;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0$a;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->h(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$a;->c:Lcom/digdroid/alman/dig/d0;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/d0;->g(Lcom/digdroid/alman/dig/d0;Z)Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$a;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/d0$q;->a()V

    return-void
.end method
