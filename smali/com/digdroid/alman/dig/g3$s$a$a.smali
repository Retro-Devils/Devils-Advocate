.class Lcom/digdroid/alman/dig/g3$s$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3$s$a;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/g3$s$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3$s$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$s$a$a;->a:Lcom/digdroid/alman/dig/g3$s$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$s$a$a;->a:Lcom/digdroid/alman/dig/g3$s$a;

    iget-object v1, v0, Lcom/digdroid/alman/dig/g3$s$a;->b:Lcom/digdroid/alman/dig/g3$s;

    const/4 v2, 0x0

    aget-object p1, p1, v2

    iput-object p1, v1, Lcom/digdroid/alman/dig/g3$s;->f:Ljava/lang/String;

    iget p1, v0, Lcom/digdroid/alman/dig/g3$s$a;->a:I

    iput p1, v1, Lcom/digdroid/alman/dig/g3$s;->e:I

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
