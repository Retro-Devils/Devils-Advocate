.class Lcom/digdroid/alman/dig/q2$n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->F3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$n0;->c:Lcom/digdroid/alman/dig/q2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$n0;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$n0;->c:Lcom/digdroid/alman/dig/q2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$n0;->b:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/q2;->x3(Landroid/app/Activity;)V

    return-void
.end method
