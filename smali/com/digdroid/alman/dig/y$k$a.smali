.class Lcom/digdroid/alman/dig/y$k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y$k;->onEvent(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/y$k;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y$k;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$k$a;->b:Lcom/digdroid/alman/dig/y$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$k$a;->b:Lcom/digdroid/alman/dig/y$k;

    iget-object v0, v0, Lcom/digdroid/alman/dig/y$k;->a:Lcom/digdroid/alman/dig/y;

    invoke-static {v0}, Lcom/digdroid/alman/dig/y;->o(Lcom/digdroid/alman/dig/y;)V

    return-void
.end method
