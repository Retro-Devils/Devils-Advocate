.class Lcom/digdroid/alman/dig/e2$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->g(II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$i;->b:Lcom/digdroid/alman/dig/e2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$i;->b:Lcom/digdroid/alman/dig/e2;

    iget-object v1, v0, Lcom/digdroid/alman/dig/e2;->b:Lcom/digdroid/alman/dig/e2$v;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lcom/digdroid/alman/dig/e2$v;->a(Landroid/view/View;I)V

    return-void
.end method
